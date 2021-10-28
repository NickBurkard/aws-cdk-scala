package io.burkard.cdk.cxapi

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AwsCloudFormationStackProperties {

  def apply(
    templateFile: Option[String] = None,
    terminationProtection: Option[Boolean] = None,
    stackName: Option[String] = None,
    parameters: Option[Map[String, String]] = None
  ): software.amazon.awscdk.cxapi.AwsCloudFormationStackProperties =
    (new software.amazon.awscdk.cxapi.AwsCloudFormationStackProperties.Builder)
      .templateFile(templateFile.orNull)
      .terminationProtection(terminationProtection.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .stackName(stackName.orNull)
      .parameters(parameters.map(_.asJava).orNull)
      .build()
}
