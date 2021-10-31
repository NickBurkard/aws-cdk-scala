package io.burkard.cdk.services.cognito

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object StringAttribute {

  def apply(
    mutable: Option[Boolean] = None,
    minLen: Option[Number] = None,
    maxLen: Option[Number] = None
  ): software.amazon.awscdk.services.cognito.StringAttribute =
    software.amazon.awscdk.services.cognito.StringAttribute.Builder
      .create()
      .mutable(mutable.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .minLen(minLen.orNull)
      .maxLen(maxLen.orNull)
      .build()
}
