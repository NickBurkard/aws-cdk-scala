package io.burkard.cdk.core

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CustomResourceProviderProps {

  def apply(
    codeDirectory: String,
    runtime: software.amazon.awscdk.CustomResourceProviderRuntime,
    description: Option[String] = None,
    memorySize: Option[software.amazon.awscdk.Size] = None,
    policyStatements: Option[List[_]] = None,
    environment: Option[Map[String, String]] = None,
    timeout: Option[software.amazon.awscdk.Duration] = None
  ): software.amazon.awscdk.CustomResourceProviderProps =
    (new software.amazon.awscdk.CustomResourceProviderProps.Builder)
      .codeDirectory(codeDirectory)
      .runtime(runtime)
      .description(description.orNull)
      .memorySize(memorySize.orNull)
      .policyStatements(policyStatements.map(_.asJava).orNull)
      .environment(environment.map(_.asJava).orNull)
      .timeout(timeout.orNull)
      .build()
}
