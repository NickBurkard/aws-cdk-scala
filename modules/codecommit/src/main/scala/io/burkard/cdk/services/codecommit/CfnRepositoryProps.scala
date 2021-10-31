package io.burkard.cdk.services.codecommit

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnRepositoryProps {

  def apply(
    repositoryName: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    repositoryDescription: Option[String] = None,
    code: Option[software.amazon.awscdk.services.codecommit.CfnRepository.CodeProperty] = None,
    triggers: Option[List[_]] = None
  ): software.amazon.awscdk.services.codecommit.CfnRepositoryProps =
    (new software.amazon.awscdk.services.codecommit.CfnRepositoryProps.Builder)
      .repositoryName(repositoryName.orNull)
      .tags(tags.map(_.asJava).orNull)
      .repositoryDescription(repositoryDescription.orNull)
      .code(code.orNull)
      .triggers(triggers.map(_.asJava).orNull)
      .build()
}
