package io.burkard.cdk.services.ses

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AddHeaderProps {

  def apply(
    name: String,
    value: String
  ): software.amazon.awscdk.services.ses.actions.AddHeaderProps =
    (new software.amazon.awscdk.services.ses.actions.AddHeaderProps.Builder)
      .name(name)
      .value(value)
      .build()
}
