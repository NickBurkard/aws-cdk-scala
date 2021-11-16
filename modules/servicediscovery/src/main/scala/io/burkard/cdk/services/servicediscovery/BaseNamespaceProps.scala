package io.burkard.cdk.services.servicediscovery

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object BaseNamespaceProps {

  def apply(
    name: String,
    description: Option[String] = None
  ): software.amazon.awscdk.services.servicediscovery.BaseNamespaceProps =
    (new software.amazon.awscdk.services.servicediscovery.BaseNamespaceProps.Builder)
      .name(name)
      .description(description.orNull)
      .build()
}
