package io.burkard.cdk.services.ecr

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnPublicRepositoryProps {

  def apply(
    repositoryName: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    repositoryCatalogData: Option[AnyRef] = None,
    repositoryPolicyText: Option[AnyRef] = None
  ): software.amazon.awscdk.services.ecr.CfnPublicRepositoryProps =
    (new software.amazon.awscdk.services.ecr.CfnPublicRepositoryProps.Builder)
      .repositoryName(repositoryName.orNull)
      .tags(tags.map(_.asJava).orNull)
      .repositoryCatalogData(repositoryCatalogData.orNull)
      .repositoryPolicyText(repositoryPolicyText.orNull)
      .build()
}
