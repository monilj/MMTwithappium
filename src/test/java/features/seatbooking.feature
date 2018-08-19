Feature:
  As a user
  I want to be able to book a seat in a bus for given date

  Scenario Outline: Book a seat in bus
    Given user on home screen taps on bus
    And user on tripDetail page taps on From
    And user on tripDetail page types on enterdeptartureCityName value "<dept_city>"
    And user on tripDetail page select first option from city
    And user on tripDetail page taps on To
    And user on tripDetail page types on enterarrivalCityName value "<arr_city>"
    And user on tripDetail page select first option from city
    And user on tripDetail page taps on Departure date
    And user on tripDetail page select date 17 "October" from calender
    And user on tripDetail page taps on OK
    And user on tripDetail page taps on SearchButton
    And user on busSearch page select first bus
    And user on seatSelectionpage selected seat number 25
    And user on seatSelectionpage taps on continue

    Examples:
    |dept_city|arr_city|
    |Bangalore|Pune    |










