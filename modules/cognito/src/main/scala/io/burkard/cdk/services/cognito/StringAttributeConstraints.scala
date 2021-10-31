package io.burkard.cdk.services.cognito

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object StringAttributeConstraints {

  def apply(
    minLen: Option[Number] = None,
    maxLen: Option[Number] = None
  ): software.amazon.awscdk.services.cognito.StringAttributeConstraints =
    (new software.amazon.awscdk.services.cognito.StringAttributeConstraints.Builder)
      .minLen(minLen.orNull)
      .maxLen(maxLen.orNull)
      .build()
}
