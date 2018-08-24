def make_readable(seconds):
    return "%02d:%02d:%02d" % (seconds / 3600, (seconds / 60) % 60, seconds % 60)

# return '{:02}:{:02}:{:02}'.format(s / 3600, s / 60 % 60, s % 60) <- was a better solution based on the formatting syntax (both work)
