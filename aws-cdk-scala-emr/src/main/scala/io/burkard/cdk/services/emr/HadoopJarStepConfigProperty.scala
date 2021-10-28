package io.burkard.cdk.services.emr

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object HadoopJarStepConfigProperty {

  def apply(
    stepProperties: Option[List[_]] = None,
    mainClass: Option[String] = None,
    args: Option[List[String]] = None,
    jar: Option[String] = None
  ): software.amazon.awscdk.services.emr.CfnCluster.HadoopJarStepConfigProperty =
    (new software.amazon.awscdk.services.emr.CfnCluster.HadoopJarStepConfigProperty.Builder)
      .stepProperties(stepProperties.map(_.asJava).orNull)
      .mainClass(mainClass.orNull)
      .args(args.map(_.asJava).orNull)
      .jar(jar.orNull)
      .build()
}
