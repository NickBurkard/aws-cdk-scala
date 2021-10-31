package io.burkard.cdk.pipelines

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ShellStepProps {

  def apply(
    additionalInputs: Option[Map[String, _ <: software.amazon.awscdk.pipelines.IFileSetProducer]] = None,
    primaryOutputDirectory: Option[String] = None,
    installCommands: Option[List[String]] = None,
    envFromCfnOutputs: Option[Map[String, _ <: software.amazon.awscdk.CfnOutput]] = None,
    commands: Option[List[String]] = None,
    input: Option[software.amazon.awscdk.pipelines.IFileSetProducer] = None,
    env: Option[Map[String, String]] = None
  ): software.amazon.awscdk.pipelines.ShellStepProps =
    (new software.amazon.awscdk.pipelines.ShellStepProps.Builder)
      .additionalInputs(additionalInputs.map(_.asJava).orNull)
      .primaryOutputDirectory(primaryOutputDirectory.orNull)
      .installCommands(installCommands.map(_.asJava).orNull)
      .envFromCfnOutputs(envFromCfnOutputs.map(_.asJava).orNull)
      .commands(commands.map(_.asJava).orNull)
      .input(input.orNull)
      .env(env.map(_.asJava).orNull)
      .build()
}
