package io.burkard.cdk.services.codeartifact

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnRepository {

  def apply(
    internalResourceId: String,
    repositoryName: Option[String] = None,
    permissionsPolicyDocument: Option[AnyRef] = None,
    domainName: Option[String] = None,
    upstreams: Option[List[String]] = None,
    externalConnections: Option[List[String]] = None,
    domainOwner: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.codeartifact.CfnRepository =
    software.amazon.awscdk.services.codeartifact.CfnRepository.Builder
      .create(stackCtx, internalResourceId)
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
