package io.burkard.cdk.services.sagemaker

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnCodeRepositoryProps {

  def apply(
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    codeRepositoryName: Option[String] = None,
    gitConfig: Option[software.amazon.awscdk.services.sagemaker.CfnCodeRepository.GitConfigProperty] = None
  ): software.amazon.awscdk.services.sagemaker.CfnCodeRepositoryProps =
    (new software.amazon.awscdk.services.sagemaker.CfnCodeRepositoryProps.Builder)
      .tags(tags.map(_.asJava).orNull)
      .codeRepositoryName(codeRepositoryName.orNull)
      .gitConfig(gitConfig.orNull)
      .build()
}
