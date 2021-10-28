package io.burkard.cdk.core

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object Stack {

  def apply(
    synthesizer: Option[software.amazon.awscdk.IStackSynthesizer] = None,
    terminationProtection: Option[Boolean] = None,
    analyticsReporting: Option[Boolean] = None,
    stackName: Option[String] = None,
    env: Option[software.amazon.awscdk.Environment] = None,
    description: Option[String] = None,
    tags: Option[Map[String, String]] = None
  ): software.amazon.awscdk.Stack =
    software.amazon.awscdk.Stack.Builder
      .create()
      .synthesizer(synthesizer.orNull)
      .terminationProtection(terminationProtection.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .analyticsReporting(analyticsReporting.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .stackName(stackName.orNull)
      .env(env.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
