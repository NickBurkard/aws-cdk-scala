package io.burkard.cdk.services.servicediscovery

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object BaseNamespaceProps {

  def apply(
    name: Option[String] = None,
    description: Option[String] = None
  ): software.amazon.awscdk.services.servicediscovery.BaseNamespaceProps =
    (new software.amazon.awscdk.services.servicediscovery.BaseNamespaceProps.Builder)
      .name(name.orNull)
      .description(description.orNull)
      .build()
}
