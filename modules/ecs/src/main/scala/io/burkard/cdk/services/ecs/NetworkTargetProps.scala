package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object NetworkTargetProps {

  def apply(
    containerPort: Option[Number] = None,
    listener: Option[String] = None
  ): software.amazon.awscdk.services.ecs.patterns.NetworkTargetProps =
    (new software.amazon.awscdk.services.ecs.patterns.NetworkTargetProps.Builder)
      .containerPort(containerPort.orNull)
      .listener(listener.orNull)
      .build()
}
