package io.burkard.cdk.services.sagemaker

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnCodeRepositoryProps {

  def apply(
    gitConfig: software.amazon.awscdk.services.sagemaker.CfnCodeRepository.GitConfigProperty,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    codeRepositoryName: Option[String] = None
  ): software.amazon.awscdk.services.sagemaker.CfnCodeRepositoryProps =
    (new software.amazon.awscdk.services.sagemaker.CfnCodeRepositoryProps.Builder)
      .gitConfig(gitConfig)
      .tags(tags.map(_.asJava).orNull)
      .codeRepositoryName(codeRepositoryName.orNull)
      .build()
}
