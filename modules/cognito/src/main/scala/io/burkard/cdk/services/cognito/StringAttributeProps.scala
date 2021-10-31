package io.burkard.cdk.services.cognito

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object StringAttributeProps {

  def apply(
    mutable: Option[Boolean] = None,
    minLen: Option[Number] = None,
    maxLen: Option[Number] = None
  ): software.amazon.awscdk.services.cognito.StringAttributeProps =
    (new software.amazon.awscdk.services.cognito.StringAttributeProps.Builder)
      .mutable(mutable.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .minLen(minLen.orNull)
      .maxLen(maxLen.orNull)
      .build()
}
