package io.burkard.cdk.services.cloudwatch

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object Dimension {

  def apply(
    name: Option[String] = None,
    value: Option[AnyRef] = None
  ): software.amazon.awscdk.services.cloudwatch.Dimension =
    (new software.amazon.awscdk.services.cloudwatch.Dimension.Builder)
      .name(name.orNull)
      .value(value.orNull)
      .build()
}
