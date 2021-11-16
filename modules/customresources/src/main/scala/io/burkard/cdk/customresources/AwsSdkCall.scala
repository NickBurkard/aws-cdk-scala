package io.burkard.cdk.customresources

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AwsSdkCall {

  def apply(
    service: String,
    action: String,
    outputPaths: Option[List[String]] = None,
    physicalResourceId: Option[software.amazon.awscdk.customresources.PhysicalResourceId] = None,
    outputPath: Option[String] = None,
    region: Option[String] = None,
    ignoreErrorCodesMatching: Option[String] = None,
    apiVersion: Option[String] = None,
    assumedRoleArn: Option[String] = None,
    parameters: Option[AnyRef] = None
  ): software.amazon.awscdk.customresources.AwsSdkCall =
    (new software.amazon.awscdk.customresources.AwsSdkCall.Builder)
      .service(service)
      .action(action)
      .outputPaths(outputPaths.map(_.asJava).orNull)
      .physicalResourceId(physicalResourceId.orNull)
      .outputPath(outputPath.orNull)
      .region(region.orNull)
      .ignoreErrorCodesMatching(ignoreErrorCodesMatching.orNull)
      .apiVersion(apiVersion.orNull)
      .assumedRoleArn(assumedRoleArn.orNull)
      .parameters(parameters.orNull)
      .build()
}
