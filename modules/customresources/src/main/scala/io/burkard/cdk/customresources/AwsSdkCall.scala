package io.burkard.cdk.customresources

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AwsSdkCall {

  def apply(
    outputPaths: Option[List[String]] = None,
    physicalResourceId: Option[software.amazon.awscdk.customresources.PhysicalResourceId] = None,
    service: Option[String] = None,
    region: Option[String] = None,
    ignoreErrorCodesMatching: Option[String] = None,
    apiVersion: Option[String] = None,
    assumedRoleArn: Option[String] = None,
    parameters: Option[AnyRef] = None,
    action: Option[String] = None
  ): software.amazon.awscdk.customresources.AwsSdkCall =
    (new software.amazon.awscdk.customresources.AwsSdkCall.Builder)
      .outputPaths(outputPaths.map(_.asJava).orNull)
      .physicalResourceId(physicalResourceId.orNull)
      .service(service.orNull)
      .region(region.orNull)
      .ignoreErrorCodesMatching(ignoreErrorCodesMatching.orNull)
      .apiVersion(apiVersion.orNull)
      .assumedRoleArn(assumedRoleArn.orNull)
      .parameters(parameters.orNull)
      .action(action.orNull)
      .build()
}
