package io.burkard.cdk.services.efs

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnFileSystem {

  def apply(
    internalResourceId: String,
    backupPolicy: Option[software.amazon.awscdk.services.efs.CfnFileSystem.BackupPolicyProperty] = None,
    bypassPolicyLockoutSafetyCheck: Option[Boolean] = None,
    performanceMode: Option[String] = None,
    encrypted: Option[Boolean] = None,
    fileSystemTags: Option[List[_ <: software.amazon.awscdk.services.efs.CfnFileSystem.ElasticFileSystemTagProperty]] = None,
    fileSystemPolicy: Option[AnyRef] = None,
    availabilityZoneName: Option[String] = None,
    provisionedThroughputInMibps: Option[Number] = None,
    lifecyclePolicies: Option[List[_]] = None,
    throughputMode: Option[String] = None,
    kmsKeyId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.efs.CfnFileSystem =
    software.amazon.awscdk.services.efs.CfnFileSystem.Builder
      .create(stackCtx, internalResourceId)
      .backupPolicy(backupPolicy.orNull)
      .bypassPolicyLockoutSafetyCheck(bypassPolicyLockoutSafetyCheck.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .performanceMode(performanceMode.orNull)
      .encrypted(encrypted.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .fileSystemTags(fileSystemTags.map(_.asJava).orNull)
      .fileSystemPolicy(fileSystemPolicy.orNull)
      .availabilityZoneName(availabilityZoneName.orNull)
      .provisionedThroughputInMibps(provisionedThroughputInMibps.orNull)
      .lifecyclePolicies(lifecyclePolicies.map(_.asJava).orNull)
      .throughputMode(throughputMode.orNull)
      .kmsKeyId(kmsKeyId.orNull)
      .build()
}
