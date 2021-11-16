package io.burkard.cdk.pipelines

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ShellStep {

  def apply(
    id: String,
    commands: List[String],
    additionalInputs: Option[Map[String, _ <: software.amazon.awscdk.pipelines.IFileSetProducer]] = None,
    primaryOutputDirectory: Option[String] = None,
    installCommands: Option[List[String]] = None,
    envFromCfnOutputs: Option[Map[String, _ <: software.amazon.awscdk.CfnOutput]] = None,
    input: Option[software.amazon.awscdk.pipelines.IFileSetProducer] = None,
    env: Option[Map[String, String]] = None
  ): software.amazon.awscdk.pipelines.ShellStep =
    software.amazon.awscdk.pipelines.ShellStep.Builder
      .create(id)
      .commands(commands.asJava)
      .additionalInputs(additionalInputs.map(_.asJava).orNull)
      .primaryOutputDirectory(primaryOutputDirectory.orNull)
      .installCommands(installCommands.map(_.asJava).orNull)
      .envFromCfnOutputs(envFromCfnOutputs.map(_.asJava).orNull)
      .input(input.orNull)
      .env(env.map(_.asJava).orNull)
      .build()
}
