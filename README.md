#### Basic Docs

---

## 문서화 통합 테스트 Repository
### MSA 환경에서 API 문서를 통합하여 관리하는 방법에 대한 테스트를 진행하는 Repository 입니다.

###

`.github/worlflows/openapi-merge.yml 파일 확인`

#### 테스트 내용
1. springdoc Swagger 를 활용 한 임시 컨트롤러 추가
2. 어플리케이션 실행 시 docs 패키지 하위에 .json 파일 추출
   - 추후 Github Actions 로 어떠한 브런치에 push 시, AWS S3 경로에 파일 떨구도록 수정하여 사용하면 될 듯
3. 추출된 .json 파일들을 redoc-cli 로 병합
4. 병합된 json 파일로 Redoc html 파일 생성
5. 생성된 html 파일을 Github Pages 에 배포

**Live Demo: https://comeevery-git.github.io/basic_docs/**