package io.burkard.cdk.services.sagemaker

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnCodeRepository {

  def apply(
    internalResourceId: String,
    gitConfig: software.amazon.awscdk.services.sagemaker.CfnCodeRepository.GitConfigProperty,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    codeRepositoryName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.sagemaker.CfnCodeRepository =
    software.amazon.awscdk.services.sagemaker.CfnCodeRepository.Builder
      .create(stackCtx, internalResourceId)
      .gitConfig(gitConfig)
      .tags(tags.map(_.asJava).orNull)
      .codeRepositoryName(codeRepositoryName.orNull)
      .build()
}
