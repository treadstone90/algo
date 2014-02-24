$(document).ready(
    function() {
        var Timer = function(element, options) {
            var defaultOptions = {
                refreshInterval: 10000,
                updateInterval: 1000,
                errorMessage: ""
            };
            this.$element = $(element);
            this.options = $.extend({}, defaultOptions, options || {});
            this.text = this.options.errorMessage;
            var self = this;

            window.setInterval(function() { self.refresh(); }, this.options.refreshInterval);
            window.setInterval(function() { self.update(); }, this.options.updateInterval);
            this.refresh();
        };

        Timer.prototype.refresh = function() {
            var self = this;
            $.get(this.options.endpoint, function(data) {
                var now = Date.now();
                // adjust for clock skew
                for (var i = 0; i < data.state.events.length; i++) {
                    var event = data.state.events[i];
                    event.target = now + event.remainingMillis;
                }
                self.data = data;
                self.update();
            })
        };

        Timer.prototype.update = function() {
            var result;
            if (this.data == null) {
                result = this.text;
            } else {
                var $label = this.$element.find(".countdownLabel");
                var $remaining = this.$element.find(".timeRemaining");

                var events = this.data.state.events;
                var currentEvent = null;
                var now = Date.now();
                for (var i = 0; i < events.length; i++) {
                    currentEvent = events[i];
                    if (currentEvent.target > now) break;
                }

                if (currentEvent == null) return;
                var timeRemaining = (currentEvent.target - now) / 1000;
                if (timeRemaining < 0) {
                    result = currentEvent.expiredMessage;
                } else {
                    var seconds = timeRemaining;

                    var minutes = seconds / 60; seconds %= 60;
                    var hours = minutes / 60; minutes %= 60;
                    result = formatTime(Math.floor(hours), Math.floor(minutes), Math.floor(seconds));
                }
                $label.text(currentEvent.label);
                $remaining.text(result);
            }
        };

        $.fn.countdownTimer = function(options) {
            return this.each(function() {
                var $this = $(this);
                $this.data('countdownTimer', new Timer($this, options));
            });
        };

        function formatTime(hours, minutes, seconds) {
            if (hours == 0) {
                return minutes + ":" + zeroPad(seconds, 2);
            } else {
                return hours + ":" + zeroPad(minutes, 2) + ":" + zeroPad(seconds, 2);
            }
        }

        function zeroPad(n, digits) {
            var s = ""+n;
            while (s.length < digits) {
                s = "0" + s;
            }
            return s;
        }
    }
);