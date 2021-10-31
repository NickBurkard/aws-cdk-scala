package io.burkard.cdk.services.cognito

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object NumberAttributeConstraints {

  def apply(
    min: Option[Number] = None,
    max: Option[Number] = None
  ): software.amazon.awscdk.services.cognito.NumberAttributeConstraints =
    (new software.amazon.awscdk.services.cognito.NumberAttributeConstraints.Builder)
      .min(min.orNull)
      .max(max.orNull)
      .build()
}
