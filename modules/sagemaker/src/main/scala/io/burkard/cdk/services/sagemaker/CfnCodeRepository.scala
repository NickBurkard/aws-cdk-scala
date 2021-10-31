package io.burkard.cdk.services.sagemaker

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnCodeRepository {

  def apply(
    internalResourceId: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    codeRepositoryName: Option[String] = None,
    gitConfig: Option[software.amazon.awscdk.services.sagemaker.CfnCodeRepository.GitConfigProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.sagemaker.CfnCodeRepository =
    software.amazon.awscdk.services.sagemaker.CfnCodeRepository.Builder
      .create(stackCtx, internalResourceId)
      .tags(tags.map(_.asJava).orNull)
      .codeRepositoryName(codeRepositoryName.orNull)
      .gitConfig(gitConfig.orNull)
      .build()
}
