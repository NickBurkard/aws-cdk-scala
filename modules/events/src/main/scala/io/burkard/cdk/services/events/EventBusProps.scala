package io.burkard.cdk.services.events

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EventBusProps {

  def apply(
    role: Option[software.amazon.awscdk.services.iam.IRole] = None
  ): software.amazon.awscdk.services.events.targets.EventBusProps =
    (new software.amazon.awscdk.services.events.targets.EventBusProps.Builder)
      .role(role.orNull)
      .build()
}
