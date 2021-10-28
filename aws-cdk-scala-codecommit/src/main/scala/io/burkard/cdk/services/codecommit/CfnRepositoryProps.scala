package io.burkard.cdk.services.codecommit

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
