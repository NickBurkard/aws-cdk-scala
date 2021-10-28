package io.burkard.cdk.services.servicediscovery

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object HttpNamespaceProps {

  def apply(
    name: Option[String] = None,
    description: Option[String] = None
  ): software.amazon.awscdk.services.servicediscovery.HttpNamespaceProps =
    (new software.amazon.awscdk.services.servicediscovery.HttpNamespaceProps.Builder)
      .name(name.orNull)
      .description(description.orNull)
      .build()
}
