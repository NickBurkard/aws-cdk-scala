package io.burkard.cdk.services.codeartifact

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnRepositoryProps {

  def apply(
    repositoryName: Option[String] = None,
    permissionsPolicyDocument: Option[AnyRef] = None,
    domainName: Option[String] = None,
    upstreams: Option[List[String]] = None,
    externalConnections: Option[List[String]] = None,
    domainOwner: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.codeartifact.CfnRepositoryProps =
    (new software.amazon.awscdk.services.codeartifact.CfnRepositoryProps.Builder)
      .repositoryName(repositoryName.orNull)
      .permissionsPolicyDocument(permissionsPolicyDocument.orNull)
      .domainName(domainName.orNull)
      .upstreams(upstreams.map(_.asJava).orNull)
      .externalConnections(externalConnections.map(_.asJava).orNull)
      .domainOwner(domainOwner.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
