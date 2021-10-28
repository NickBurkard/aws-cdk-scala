package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AuditCheckConfigurationsProperty {

  def apply(
    conflictingClientIdsCheck: Option[software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration.AuditCheckConfigurationProperty] = None,
    deviceCertificateSharedCheck: Option[software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration.AuditCheckConfigurationProperty] = None,
    unauthenticatedCognitoRoleOverlyPermissiveCheck: Option[software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration.AuditCheckConfigurationProperty] = None,
    caCertificateExpiringCheck: Option[software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration.AuditCheckConfigurationProperty] = None,
    revokedCaCertificateStillActiveCheck: Option[software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration.AuditCheckConfigurationProperty] = None,
    revokedDeviceCertificateStillActiveCheck: Option[software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration.AuditCheckConfigurationProperty] = None,
    authenticatedCognitoRoleOverlyPermissiveCheck: Option[software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration.AuditCheckConfigurationProperty] = None,
    deviceCertificateKeyQualityCheck: Option[software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration.AuditCheckConfigurationProperty] = None,
    deviceCertificateExpiringCheck: Option[software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration.AuditCheckConfigurationProperty] = None,
    iotRoleAliasAllowsAccessToUnusedServicesCheck: Option[software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration.AuditCheckConfigurationProperty] = None,
    loggingDisabledCheck: Option[software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration.AuditCheckConfigurationProperty] = None,
    iotPolicyOverlyPermissiveCheck: Option[software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration.AuditCheckConfigurationProperty] = None,
    caCertificateKeyQualityCheck: Option[software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration.AuditCheckConfigurationProperty] = None,
    iotRoleAliasOverlyPermissiveCheck: Option[software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration.AuditCheckConfigurationProperty] = None
  ): software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration.AuditCheckConfigurationsProperty =
    (new software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration.AuditCheckConfigurationsProperty.Builder)
      .conflictingClientIdsCheck(conflictingClientIdsCheck.orNull)
      .deviceCertificateSharedCheck(deviceCertificateSharedCheck.orNull)
      .unauthenticatedCognitoRoleOverlyPermissiveCheck(unauthenticatedCognitoRoleOverlyPermissiveCheck.orNull)
      .caCertificateExpiringCheck(caCertificateExpiringCheck.orNull)
      .revokedCaCertificateStillActiveCheck(revokedCaCertificateStillActiveCheck.orNull)
      .revokedDeviceCertificateStillActiveCheck(revokedDeviceCertificateStillActiveCheck.orNull)
      .authenticatedCognitoRoleOverlyPermissiveCheck(authenticatedCognitoRoleOverlyPermissiveCheck.orNull)
      .deviceCertificateKeyQualityCheck(deviceCertificateKeyQualityCheck.orNull)
      .deviceCertificateExpiringCheck(deviceCertificateExpiringCheck.orNull)
      .iotRoleAliasAllowsAccessToUnusedServicesCheck(iotRoleAliasAllowsAccessToUnusedServicesCheck.orNull)
      .loggingDisabledCheck(loggingDisabledCheck.orNull)
      .iotPolicyOverlyPermissiveCheck(iotPolicyOverlyPermissiveCheck.orNull)
      .caCertificateKeyQualityCheck(caCertificateKeyQualityCheck.orNull)
      .iotRoleAliasOverlyPermissiveCheck(iotRoleAliasOverlyPermissiveCheck.orNull)
      .build()
}
