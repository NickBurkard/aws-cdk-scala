package io.burkard.cdk.services.servicediscovery

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnInstanceProps {

  def apply(
    instanceAttributes: AnyRef,
    serviceId: String,
    instanceId: Option[String] = None
  ): software.amazon.awscdk.services.servicediscovery.CfnInstanceProps =
    (new software.amazon.awscdk.services.servicediscovery.CfnInstanceProps.Builder)
      .instanceAttributes(instanceAttributes)
      .serviceId(serviceId)
      .instanceId(instanceId.orNull)
      .build()
}
