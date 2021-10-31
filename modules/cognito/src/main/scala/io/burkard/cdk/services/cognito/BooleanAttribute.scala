package io.burkard.cdk.services.cognito

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object BooleanAttribute {

  def apply(
    mutable: Option[Boolean] = None
  ): software.amazon.awscdk.services.cognito.BooleanAttribute =
    software.amazon.awscdk.services.cognito.BooleanAttribute.Builder
      .create()
      .mutable(mutable.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
