package io.burkard.cdk.services.emr

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object HadoopJarStepConfigProperty {

  def apply(
    jar: String,
    stepProperties: Option[List[_]] = None,
    mainClass: Option[String] = None,
    args: Option[List[String]] = None
  ): software.amazon.awscdk.services.emr.CfnCluster.HadoopJarStepConfigProperty =
    (new software.amazon.awscdk.services.emr.CfnCluster.HadoopJarStepConfigProperty.Builder)
      .jar(jar)
      .stepProperties(stepProperties.map(_.asJava).orNull)
      .mainClass(mainClass.orNull)
      .args(args.map(_.asJava).orNull)
      .build()
}
