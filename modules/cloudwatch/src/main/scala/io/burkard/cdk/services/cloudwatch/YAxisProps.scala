package io.burkard.cdk.services.cloudwatch

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object YAxisProps {

  def apply(
    label: Option[String] = None,
    min: Option[Number] = None,
    max: Option[Number] = None,
    showUnits: Option[Boolean] = None
  ): software.amazon.awscdk.services.cloudwatch.YAxisProps =
    (new software.amazon.awscdk.services.cloudwatch.YAxisProps.Builder)
      .label(label.orNull)
      .min(min.orNull)
      .max(max.orNull)
      .showUnits(showUnits.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
