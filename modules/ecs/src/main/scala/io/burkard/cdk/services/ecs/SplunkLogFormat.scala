package io.burkard.cdk.services.ecs

sealed abstract class SplunkLogFormat(val underlying: software.amazon.awscdk.services.ecs.SplunkLogFormat)
  extends Product
    with Serializable

object SplunkLogFormat {
  implicit def toAws(value: SplunkLogFormat): software.amazon.awscdk.services.ecs.SplunkLogFormat =
    Option(value).map(_.underlying).orNull

  case object Inline
    extends SplunkLogFormat(software.amazon.awscdk.services.ecs.SplunkLogFormat.INLINE)

  case object Json
    extends SplunkLogFormat(software.amazon.awscdk.services.ecs.SplunkLogFormat.JSON)

  case object Raw
    extends SplunkLogFormat(software.amazon.awscdk.services.ecs.SplunkLogFormat.RAW)
}
