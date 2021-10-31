package io.burkard.cdk.services.cognito

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object NumberAttributeProps {

  def apply(
    mutable: Option[Boolean] = None,
    min: Option[Number] = None,
    max: Option[Number] = None
  ): software.amazon.awscdk.services.cognito.NumberAttributeProps =
    (new software.amazon.awscdk.services.cognito.NumberAttributeProps.Builder)
      .mutable(mutable.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .min(min.orNull)
      .max(max.orNull)
      .build()
}
