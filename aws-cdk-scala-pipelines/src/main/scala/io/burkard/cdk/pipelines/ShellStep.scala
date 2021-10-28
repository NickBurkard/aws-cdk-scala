package io.burkard.cdk.pipelines

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ShellStep {

  def apply(
    id: String,
    additionalInputs: Option[Map[String, _ <: software.amazon.awscdk.pipelines.IFileSetProducer]] = None,
    primaryOutputDirectory: Option[String] = None,
    installCommands: Option[List[String]] = None,
    envFromCfnOutputs: Option[Map[String, _ <: software.amazon.awscdk.CfnOutput]] = None,
    commands: Option[List[String]] = None,
    input: Option[software.amazon.awscdk.pipelines.IFileSetProducer] = None,
    env: Option[Map[String, String]] = None
  ): software.amazon.awscdk.pipelines.ShellStep =
    software.amazon.awscdk.pipelines.ShellStep.Builder
      .create(id)
      .additionalInputs(additionalInputs.map(_.asJava).orNull)
      .primaryOutputDirectory(primaryOutputDirectory.orNull)
      .installCommands(installCommands.map(_.asJava).orNull)
      .envFromCfnOutputs(envFromCfnOutputs.map(_.asJava).orNull)
      .commands(commands.map(_.asJava).orNull)
      .input(input.orNull)
      .env(env.map(_.asJava).orNull)
      .build()
}
