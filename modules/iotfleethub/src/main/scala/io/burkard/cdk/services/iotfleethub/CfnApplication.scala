package io.burkard.cdk.services.iotfleethub

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnApplication {

  def apply(
    internalResourceId: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    applicationName: Option[String] = None,
    applicationDescription: Option[String] = None,
    roleArn: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.iotfleethub.CfnApplication =
    software.amazon.awscdk.services.iotfleethub.CfnApplication.Builder
      .create(stackCtx, internalResourceId)
      .tags(tags.map(_.asJava).orNull)
      .applicationName(applicationName.orNull)
      .applicationDescription(applicationDescription.orNull)
      .roleArn(roleArn.orNull)
      .build()
}
