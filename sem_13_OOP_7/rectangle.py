from graphical_lib import GraphicalLibrary as gl

class CalcRectangle:

    def __init__(self, width, height):
        self._width = width
        self._height = height

    @property
    def width(self):
        return self._width

    @property
    def height(self):
        return self._height

    @property
    def area(self):
        return self._width * self._height

class DrawRectangle:

    def __init__(self, calc_rectangle: CalcRectangle):
        self._calc_rectangle = calc_rectangle

    def draw(self):
        gl.drawRectangle(0, 0, self._calc_rectangle.width, self._calc_rectangle.height, '#')