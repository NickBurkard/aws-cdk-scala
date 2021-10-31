package io.burkard.cdk.services.ecr

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnPublicRepository {

  def apply(
    internalResourceId: String,
    repositoryName: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    repositoryCatalogData: Option[AnyRef] = None,
    repositoryPolicyText: Option[AnyRef] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ecr.CfnPublicRepository =
    software.amazon.awscdk.services.ecr.CfnPublicRepository.Builder
      .create(stackCtx, internalResourceId)
      .repositoryName(repositoryName.orNull)
      .tags(tags.map(_.asJava).orNull)
      .repositoryCatalogData(repositoryCatalogData.orNull)
      .repositoryPolicyText(repositoryPolicyText.orNull)
      .build()
}
