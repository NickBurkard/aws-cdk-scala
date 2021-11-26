package io.burkard.cdk.services.ecs

sealed abstract class GelfCompressionType(val underlying: software.amazon.awscdk.services.ecs.GelfCompressionType)
  extends Product
    with Serializable

object GelfCompressionType {
  implicit def toAws(value: GelfCompressionType): software.amazon.awscdk.services.ecs.GelfCompressionType =
    Option(value).map(_.underlying).orNull

  case object Gzip
    extends GelfCompressionType(software.amazon.awscdk.services.ecs.GelfCompressionType.GZIP)

  case object None
    extends GelfCompressionType(software.amazon.awscdk.services.ecs.GelfCompressionType.NONE)

  case object Zlib
    extends GelfCompressionType(software.amazon.awscdk.services.ecs.GelfCompressionType.ZLIB)
}
