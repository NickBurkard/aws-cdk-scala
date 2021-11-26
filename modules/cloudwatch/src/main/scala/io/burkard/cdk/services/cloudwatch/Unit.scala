package io.burkard.cdk.services.cloudwatch

sealed abstract class Unit(val underlying: software.amazon.awscdk.services.cloudwatch.Unit)
  extends Product
    with Serializable

object Unit {
  implicit def toAws(value: Unit): software.amazon.awscdk.services.cloudwatch.Unit =
    Option(value).map(_.underlying).orNull

  case object Bits
    extends Unit(software.amazon.awscdk.services.cloudwatch.Unit.BITS)

  case object BitsPerSecond
    extends Unit(software.amazon.awscdk.services.cloudwatch.Unit.BITS_PER_SECOND)

  case object Bytes
    extends Unit(software.amazon.awscdk.services.cloudwatch.Unit.BYTES)

  case object BytesPerSecond
    extends Unit(software.amazon.awscdk.services.cloudwatch.Unit.BYTES_PER_SECOND)

  case object Count
    extends Unit(software.amazon.awscdk.services.cloudwatch.Unit.COUNT)

  case object CountPerSecond
    extends Unit(software.amazon.awscdk.services.cloudwatch.Unit.COUNT_PER_SECOND)

  case object Gigabits
    extends Unit(software.amazon.awscdk.services.cloudwatch.Unit.GIGABITS)

  case object GigabitsPerSecond
    extends Unit(software.amazon.awscdk.services.cloudwatch.Unit.GIGABITS_PER_SECOND)

  case object Gigabytes
    extends Unit(software.amazon.awscdk.services.cloudwatch.Unit.GIGABYTES)

  case object GigabytesPerSecond
    extends Unit(software.amazon.awscdk.services.cloudwatch.Unit.GIGABYTES_PER_SECOND)

  case object Kilobits
    extends Unit(software.amazon.awscdk.services.cloudwatch.Unit.KILOBITS)

  case object KilobitsPerSecond
    extends Unit(software.amazon.awscdk.services.cloudwatch.Unit.KILOBITS_PER_SECOND)

  case object Kilobytes
    extends Unit(software.amazon.awscdk.services.cloudwatch.Unit.KILOBYTES)

  case object KilobytesPerSecond
    extends Unit(software.amazon.awscdk.services.cloudwatch.Unit.KILOBYTES_PER_SECOND)

  case object Megabits
    extends Unit(software.amazon.awscdk.services.cloudwatch.Unit.MEGABITS)

  case object MegabitsPerSecond
    extends Unit(software.amazon.awscdk.services.cloudwatch.Unit.MEGABITS_PER_SECOND)

  case object Megabytes
    extends Unit(software.amazon.awscdk.services.cloudwatch.Unit.MEGABYTES)

  case object MegabytesPerSecond
    extends Unit(software.amazon.awscdk.services.cloudwatch.Unit.MEGABYTES_PER_SECOND)

  case object Microseconds
    extends Unit(software.amazon.awscdk.services.cloudwatch.Unit.MICROSECONDS)

  case object Milliseconds
    extends Unit(software.amazon.awscdk.services.cloudwatch.Unit.MILLISECONDS)

  case object None
    extends Unit(software.amazon.awscdk.services.cloudwatch.Unit.NONE)

  case object Percent
    extends Unit(software.amazon.awscdk.services.cloudwatch.Unit.PERCENT)

  case object Seconds
    extends Unit(software.amazon.awscdk.services.cloudwatch.Unit.SECONDS)

  case object Terabits
    extends Unit(software.amazon.awscdk.services.cloudwatch.Unit.TERABITS)

  case object TerabitsPerSecond
    extends Unit(software.amazon.awscdk.services.cloudwatch.Unit.TERABITS_PER_SECOND)

  case object Terabytes
    extends Unit(software.amazon.awscdk.services.cloudwatch.Unit.TERABYTES)

  case object TerabytesPerSecond
    extends Unit(software.amazon.awscdk.services.cloudwatch.Unit.TERABYTES_PER_SECOND)
}
