package io.burkard.cdk.services.ses

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AddHeaderProps {

  def apply(
    name: Option[String] = None,
    value: Option[String] = None
  ): software.amazon.awscdk.services.ses.actions.AddHeaderProps =
    (new software.amazon.awscdk.services.ses.actions.AddHeaderProps.Builder)
      .name(name.orNull)
      .value(value.orNull)
      .build()
}
