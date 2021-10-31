package io.burkard.cdk.services.cognito

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object NumberAttribute {

  def apply(
    mutable: Option[Boolean] = None,
    min: Option[Number] = None,
    max: Option[Number] = None
  ): software.amazon.awscdk.services.cognito.NumberAttribute =
    software.amazon.awscdk.services.cognito.NumberAttribute.Builder
      .create()
      .mutable(mutable.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .min(min.orNull)
      .max(max.orNull)
      .build()
}
