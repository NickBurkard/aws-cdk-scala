package io.burkard.cdk.services.codeartifact

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnRepositoryProps {

  def apply(
    repositoryName: String,
    domainName: String,
    permissionsPolicyDocument: Option[AnyRef] = None,
    upstreams: Option[List[String]] = None,
    externalConnections: Option[List[String]] = None,
    domainOwner: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.codeartifact.CfnRepositoryProps =
    (new software.amazon.awscdk.services.codeartifact.CfnRepositoryProps.Builder)
      .repositoryName(repositoryName)
      .domainName(domainName)
      .permissionsPolicyDocument(permissionsPolicyDocument.orNull)
      .upstreams(upstreams.map(_.asJava).orNull)
      .externalConnections(externalConnections.map(_.asJava).orNull)
      .domainOwner(domainOwner.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
