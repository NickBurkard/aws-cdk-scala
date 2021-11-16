package io.burkard.cdk.services.codepipeline

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object S3DeployActionProps {

  def apply(
    bucket: software.amazon.awscdk.services.s3.IBucket,
    input: software.amazon.awscdk.services.codepipeline.Artifact,
    objectKey: Option[String] = None,
    cacheControl: Option[List[_ <: software.amazon.awscdk.services.codepipeline.actions.CacheControl]] = None,
    role: Option[software.amazon.awscdk.services.iam.IRole] = None,
    accessControl: Option[software.amazon.awscdk.services.s3.BucketAccessControl] = None,
    variablesNamespace: Option[String] = None,
    runOrder: Option[Number] = None,
    actionName: Option[String] = None,
    extract: Option[Boolean] = None
  ): software.amazon.awscdk.services.codepipeline.actions.S3DeployActionProps =
    (new software.amazon.awscdk.services.codepipeline.actions.S3DeployActionProps.Builder)
      .bucket(bucket)
      .input(input)
      .objectKey(objectKey.orNull)
      .cacheControl(cacheControl.map(_.asJava).orNull)
      .role(role.orNull)
      .accessControl(accessControl.orNull)
      .variablesNamespace(variablesNamespace.orNull)
      .runOrder(runOrder.orNull)
      .actionName(actionName.orNull)
      .extract(extract.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
