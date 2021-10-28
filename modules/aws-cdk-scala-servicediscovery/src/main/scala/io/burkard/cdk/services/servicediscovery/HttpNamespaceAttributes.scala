package io.burkard.cdk.services.servicediscovery

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object HttpNamespaceAttributes {

  def apply(
    namespaceArn: Option[String] = None,
    namespaceName: Option[String] = None,
    namespaceId: Option[String] = None
  ): software.amazon.awscdk.services.servicediscovery.HttpNamespaceAttributes =
    (new software.amazon.awscdk.services.servicediscovery.HttpNamespaceAttributes.Builder)
      .namespaceArn(namespaceArn.orNull)
      .namespaceName(namespaceName.orNull)
      .namespaceId(namespaceId.orNull)
      .build()
}
