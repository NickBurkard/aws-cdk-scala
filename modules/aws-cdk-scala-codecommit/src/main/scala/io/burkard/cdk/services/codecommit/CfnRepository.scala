package io.burkard.cdk.services.codecommit

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnRepository {

  def apply(
    internalResourceId: String,
    repositoryName: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    repositoryDescription: Option[String] = None,
    code: Option[software.amazon.awscdk.services.codecommit.CfnRepository.CodeProperty] = None,
    triggers: Option[List[_]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.codecommit.CfnRepository =
    software.amazon.awscdk.services.codecommit.CfnRepository.Builder
      .create(stackCtx, internalResourceId)
      .repositoryName(repositoryName.orNull)
      .tags(tags.map(_.asJava).orNull)
      .repositoryDescription(repositoryDescription.orNull)
      .code(code.orNull)
      .triggers(triggers.map(_.asJava).orNull)
      .build()
}
