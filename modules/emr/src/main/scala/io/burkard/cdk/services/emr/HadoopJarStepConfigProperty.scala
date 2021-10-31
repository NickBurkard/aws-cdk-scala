package io.burkard.cdk.services.emr

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object HadoopJarStepConfigProperty {

  def apply(
    stepProperties: Option[List[_]] = None,
    mainClass: Option[String] = None,
    args: Option[List[String]] = None,
    jar: Option[String] = None
  ): software.amazon.awscdk.services.emr.CfnStep.HadoopJarStepConfigProperty =
    (new software.amazon.awscdk.services.emr.CfnStep.HadoopJarStepConfigProperty.Builder)
      .stepProperties(stepProperties.map(_.asJava).orNull)
      .mainClass(mainClass.orNull)
      .args(args.map(_.asJava).orNull)
      .jar(jar.orNull)
      .build()
}
