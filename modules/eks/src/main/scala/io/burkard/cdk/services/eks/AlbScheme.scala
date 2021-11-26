package io.burkard.cdk.services.eks

sealed abstract class AlbScheme(val underlying: software.amazon.awscdk.services.eks.AlbScheme)
  extends Product
    with Serializable

object AlbScheme {
  implicit def toAws(value: AlbScheme): software.amazon.awscdk.services.eks.AlbScheme =
    Option(value).map(_.underlying).orNull

  case object Internal
    extends AlbScheme(software.amazon.awscdk.services.eks.AlbScheme.INTERNAL)

  case object InternetFacing
    extends AlbScheme(software.amazon.awscdk.services.eks.AlbScheme.INTERNET_FACING)
}
