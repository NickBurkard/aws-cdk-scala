package io.burkard.cdk.services.cognito

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CustomAttributeProps {

  def apply(
    mutable: Option[Boolean] = None
  ): software.amazon.awscdk.services.cognito.CustomAttributeProps =
    (new software.amazon.awscdk.services.cognito.CustomAttributeProps.Builder)
      .mutable(mutable.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
